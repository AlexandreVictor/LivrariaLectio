package br.com.LivrariaLectio.controle;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.apache.log4j.Logger;
/*ciclo de vida JSF*/

@SuppressWarnings("serial")
public class CursoJsfPhaseListener implements PhaseListener {

	protected static final Logger log = Logger
			.getLogger(CursoJsfPhaseListener.class);

	public void afterPhase(PhaseEvent event) {
		log.info(" afterPhase - " + event.getPhaseId().toString());

	}

	public void beforePhase(PhaseEvent event) {
		log.info(" beforePhase - " + event.getPhaseId().toString());

	}

	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub

		return PhaseId.ANY_PHASE;

	}

}