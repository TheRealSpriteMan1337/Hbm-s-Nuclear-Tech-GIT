package com.hbm.tileentity.machine.rbmk;

import com.hbm.handler.neutron.NeutronStream;

public interface IRBMKFluxReceiver {
	
	public enum NType {
		FAST("trait.rbmk.neutron.fast"),
		SLOW("trait.rbmk.neutron.slow"),
		ANY("trait.rbmk.neutron.any");	//not to be used for reactor flux calculation, only for the fuel designation
		
		public String unlocalized;
		
		private NType(String loc) {
			this.unlocalized = loc;
		}
	}
	
	public void receiveFlux(NeutronStream stream);
}
