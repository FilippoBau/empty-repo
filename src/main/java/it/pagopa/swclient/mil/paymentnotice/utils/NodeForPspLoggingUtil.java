package it.pagopa.swclient.mil.paymentnotice.utils;

import it.gov.pagopa.pagopa_api.node.nodeforpsp.CtPaymentOptionDescription;
import it.gov.pagopa.pagopa_api.node.nodeforpsp.VerifyPaymentNoticeRes;
import it.gov.pagopa.pagopa_api.xsd.common_types.v1_0.CtFaultBean;

/**
 * Utility class to be used when logging the request / response classes generated by the CXF codegen maven plugin
 */
public class NodeForPspLoggingUtil {

    private NodeForPspLoggingUtil() {}

    public static String toString(VerifyPaymentNoticeRes verifyPaymentNoticeRes) {
        final StringBuilder sb = new StringBuilder("VerifyPaymentNoticeRes{");
        sb.append("paymentList=").append(verifyPaymentNoticeRes.getPaymentList());
        sb.append(", paymentDescription='").append(verifyPaymentNoticeRes.getPaymentDescription()).append('\'');
        sb.append(", fiscalCodePA='").append(verifyPaymentNoticeRes.getFiscalCodePA()).append('\'');
        sb.append(", companyName='").append(verifyPaymentNoticeRes.getCompanyName()).append('\'');
        sb.append(", officeName='").append(verifyPaymentNoticeRes.getOfficeName()).append('\'');
        sb.append(", outcome=").append(verifyPaymentNoticeRes.getOutcome() != null ? verifyPaymentNoticeRes.getOutcome().name() : "null");
        sb.append(", fault=").append(toString(verifyPaymentNoticeRes.getFault()));
        sb.append('}');
        return sb.toString();
    }


    public static String toString(CtFaultBean ctFaultBean) {
        if (ctFaultBean != null) {
            final StringBuilder sb = new StringBuilder("CtFaultBean{");
            sb.append("faultCode='").append(ctFaultBean.getFaultCode()).append('\'');
            sb.append(", faultString='").append(ctFaultBean.getFaultString()).append('\'');
            sb.append(", id='").append(ctFaultBean.getId()).append('\'');
            sb.append(", description='").append(ctFaultBean.getDescription()).append('\'');
            sb.append(", serial=").append(ctFaultBean.getSerial());
            sb.append(", originalFaultCode='").append(ctFaultBean.getOriginalFaultCode()).append('\'');
            sb.append(", originalFaultString='").append(ctFaultBean.getFaultString()).append('\'');
            sb.append(", originalDescription='").append(ctFaultBean.getOriginalDescription()).append('\'');
            sb.append('}');
            return sb.toString();
        }
        else return "null";
    }


    public static String toString(CtPaymentOptionDescription ctPaymentOptionDescription) {
        final StringBuilder sb = new StringBuilder("CtPaymentOptionDescription{");
        sb.append("amount=").append(ctPaymentOptionDescription.getAmount());
        sb.append(", options=").append(ctPaymentOptionDescription.getOptions().name());
        sb.append(", dueDate=").append(ctPaymentOptionDescription.getDueDate());
        sb.append(", paymentNote='").append(ctPaymentOptionDescription.getPaymentNote()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}

