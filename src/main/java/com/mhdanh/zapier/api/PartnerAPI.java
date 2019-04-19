package com.mhdanh.zapier.api;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mhdanh.zapier.data.PartnerRepo;
import com.mhdanh.zapier.model.Partner;

@Path("{tenant}/partners")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PartnerAPI {
	
	@Inject
	private PartnerRepo partnerRepo;
	
	@GET
	public List<Partner> getAllPartner(@PathParam("tenant") String tenant) {
		return partnerRepo.getAll(tenant);
	}
	
	@POST
	public Partner createPartner(@PathParam("tenant") String tenant, Partner partner) {
		partner.setTenant(tenant);
		return partnerRepo.create(partner);
	}
	
}
