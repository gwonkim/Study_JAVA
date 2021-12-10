package net.skhu.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.entity.Student;
import net.skhu.model.Pagination;

public interface StudentRepository  extends JpaRepository<Student, Integer> {

    public default List<Student> findAll(Pagination pagination) {
        Page<Student> page = this.findAll(PageRequest.of(pagination.getPg() - 1, pagination.getSz(),
                                           Sort.Direction.ASC, "id"));
        pagination.setRecordCount((int)page.getTotalElements());
        return page.getContent();
    }

    Page<Student> findByDepartmentId(int departmentId, Pageable pageable); // 자동 구현

    public default List<Student> findByDepartmentId(Pagination pagination) {
        if (pagination.getDi() == 0) return findAll(pagination);
        Page<Student> page = this.findByDepartmentId(pagination.getDi(), // Query Creation 기능으로 자동 구현된 메소드
                PageRequest.of(pagination.getPg() - 1, pagination.getSz(), Sort.Direction.ASC, "id"));  // pagination 정보
        pagination.setRecordCount((int)page.getTotalElements());
        return page.getContent();
    }
}
