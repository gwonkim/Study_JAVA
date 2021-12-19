package net.skhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.entity.Country;

public interface CountryRepository  extends JpaRepository<Country, Integer> {

}
