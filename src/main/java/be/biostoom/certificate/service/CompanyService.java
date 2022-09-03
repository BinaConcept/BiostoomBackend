package be.biostoom.certificate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.biostoom.certificate.model.Company;
import be.biostoom.certificate.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	CompanyRepository repository;

	public List<Company> getAllCompanies() {
		return repository.findAll();
	}

	public Company save(Company company) {

		return repository.save(company);

	}

	public Company getCompany(Long id) {
		return repository.findById(id).get();
	}

	public Company update(long id, Company company) {
		return repository.save(company);
	}

	public String delete(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return "deleted";
	}
}