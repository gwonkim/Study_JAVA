package net.skhu.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.entity.City;
import net.skhu.model.Pagination;

public interface CityRepository  extends JpaRepository<City, Integer> {

    public default List<City> findAll(Pagination pagination) {
        Page<City> page = this.findAll(PageRequest.of(pagination.getPg() - 1, pagination.getSz(),
                                           Sort.Direction.ASC, "name")); // 도시명 오름차순
        pagination.setRecordCount((int)page.getTotalElements());
        return page.getContent();
    }

    Page<City> findByCountryId(int countryId, Pageable pageable);

    public default List<City> findByCountryId(Pagination pagination) {
        if (pagination.getCi() == 0) return findAll(pagination);
        Page<City> page = this.findByCountryId(pagination.getCi(),
                PageRequest.of(pagination.getPg() - 1, pagination.getSz(), Sort.Direction.ASC, "id"));
        pagination.setRecordCount((int)page.getTotalElements());
        return page.getContent();
    }
}

