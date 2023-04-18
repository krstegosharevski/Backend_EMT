package mk.ukim.finki.emt.eshop.service.impl;

import mk.ukim.finki.emt.eshop.model.Country;
import mk.ukim.finki.emt.eshop.model.exceptions.CountryNotFoundException;
import mk.ukim.finki.emt.eshop.repository.CountryRepository;
import mk.ukim.finki.emt.eshop.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> listAll() {
        return this.countryRepository.findAll();
    }

    @Override
    public Country findById(Long id) {
        return this.countryRepository.findById(id)
                .orElseThrow(() -> new CountryNotFoundException(id));
    }

    @Override
    public Country create(Country country) {
        return this.countryRepository.save(country);
    }
}
