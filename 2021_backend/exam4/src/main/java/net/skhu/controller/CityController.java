package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.entity.City;
import net.skhu.model.Pagination;
import net.skhu.repository.CityRepository;
import net.skhu.repository.CountryRepository;

@Controller
@RequestMapping("city")
public class CityController {

    @Autowired CityRepository cityRepository;
    @Autowired CountryRepository countryRepository;

    @RequestMapping("list")
    public String list(Model model, Pagination pagination) {
        List<City> cities = cityRepository.findByCountryId(pagination);
        model.addAttribute("cities", cities);
        model.addAttribute("countries", countryRepository.findAll());
        return "city/list";
    }

    @GetMapping("create")
    public String create(Model model, Pagination pagination) {
        model.addAttribute("city", new City());
        model.addAttribute("countries", countryRepository.findAll());
        return "city/edit";
    }

    @PostMapping("create")
    public String create(Model model, City city, Pagination pagination) {
    	cityRepository.save(city);
        pagination.setCi(0);
        pagination.setPg(1); // 1 페이지로 리다이렉트
        return "redirect:list?" + pagination.getQueryString();
    }

    @GetMapping("edit")
    public String edit(Model model, @RequestParam("id") int id, Pagination pagination) {
    	City city = cityRepository.findById(id).get();
        model.addAttribute("city", city);
        model.addAttribute("countries", countryRepository.findAll());
        return "city/edit";
    }

    @PostMapping(value="edit", params="cmd=save")
    public String edit(Model model, City city, Pagination pagination) {
    	cityRepository.save(city);
        return "redirect:list?" + pagination.getQueryString();
    }

    @PostMapping(value="edit", params="cmd=delete")
    public String delete(Model model, @RequestParam("id") int id, Pagination pagination) {
    	cityRepository.deleteById(id);
        return "redirect:list?" + pagination.getQueryString();
    }
}

