package payment.dto;

/**
 * Created by AdeolaOjo on 7/16/2016.
 */
public class BankProcessor {

    private int id;
    private String processorDescription;
    private int processorAcquirerId;
    private int threashold;
    private int interval;
    private String receivingInstitutionId;
    private boolean isStpProcessor;
}
