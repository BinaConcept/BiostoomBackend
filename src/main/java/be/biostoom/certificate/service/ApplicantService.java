package be.biostoom.certificate.service;

import be.biostoom.certificate.model.dto.PermitStarterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.biostoom.certificate.model.Permit;
import be.biostoom.certificate.model.SiteIntroduction;
import be.biostoom.certificate.model.dto.ApplicantStopPermitDTO;
import be.biostoom.certificate.repository.SiteIntroductionRepository;

@Service
public class ApplicantService {

	@Autowired
	SiteIntroductionRepository introductionRepository;
	
	@Autowired
	PermitService permitService;
	
	public SiteIntroduction getSiteIntroduction() {
		return introductionRepository.findAll().get(0);
	}

	public Long createPermit(Permit permit) {
		return permitService.applicantCreatePermit(permit);
	}

	public Long applicantStopPermit(ApplicantStopPermitDTO dto) {
		return permitService.applicantStopPermit(dto);
	}


	public Long applicantRestartsPermit(PermitStarterDTO dto) {
		return permitService.applicantReStartPermit(dto);
	}
}
