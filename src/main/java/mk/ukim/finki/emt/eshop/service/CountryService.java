package mk.ukim.finki.emt.eshop.service;

import mk.ukim.finki.emt.eshop.model.Country;

import java.util.List;

public interface CountryService {

    List<Country> listAll();

    Country findById(Long id);

    Country create(Country country);
}
