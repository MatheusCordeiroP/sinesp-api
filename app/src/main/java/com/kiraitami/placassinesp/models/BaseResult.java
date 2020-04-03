package com.kiraitami.placassinesp.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class BaseResult {
    private String UniqueIdentifier;
    private float TransactionResultTypeCode;
    private String TransactionResultType;
    private String Message;
    private float TotalCostInCredits;
    private float BalanceInCredits;
    private float ElapsedTimeInMilliseconds;
    private String Date;
    private boolean OutdatedResult;
    private boolean HasPdf;
    private String ValidationResultRiskIndicator;
    ArrayList< Object > ValidationResults = new ArrayList < Object > ();
    private String DateString;
    private String OriginalFilesUrl;
    private String PdfUrl;
    private float TotalCost;
    private String ValidationResultRiskIndicatorN;
    ArrayList < Object > ValidationResultsN = new ArrayList < Object > ();
    @SerializedName("Result")
    Result ResultObject;


    // Getter Methods

    public String getUniqueIdentifier() {
        return UniqueIdentifier;
    }

    public float getTransactionResultTypeCode() {
        return TransactionResultTypeCode;
    }

    public String getTransactionResultType() {
        return TransactionResultType;
    }

    public String getMessage() {
        return Message;
    }

    public float getTotalCostInCredits() {
        return TotalCostInCredits;
    }

    public float getBalanceInCredits() {
        return BalanceInCredits;
    }

    public float getElapsedTimeInMilliseconds() {
        return ElapsedTimeInMilliseconds;
    }

    public String getDate() {
        return Date;
    }

    public boolean getOutdatedResult() {
        return OutdatedResult;
    }

    public boolean getHasPdf() {
        return HasPdf;
    }

    public String getValidationResultRiskIndicator() {
        return ValidationResultRiskIndicator;
    }

    public String getDateString() {
        return DateString;
    }

    public String getOriginalFilesUrl() {
        return OriginalFilesUrl;
    }

    public String getPdfUrl() {
        return PdfUrl;
    }

    public float getTotalCost() {
        return TotalCost;
    }

    public String getValidationResultRiskIndicatorN() {
        return ValidationResultRiskIndicatorN;
    }

    public Result getResult() {
        return ResultObject;
    }

    // Setter Methods

    public void setUniqueIdentifier(String UniqueIdentifier) {
        this.UniqueIdentifier = UniqueIdentifier;
    }

    public void setTransactionResultTypeCode(float TransactionResultTypeCode) {
        this.TransactionResultTypeCode = TransactionResultTypeCode;
    }

    public void setTransactionResultType(String TransactionResultType) {
        this.TransactionResultType = TransactionResultType;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public void setTotalCostInCredits(float TotalCostInCredits) {
        this.TotalCostInCredits = TotalCostInCredits;
    }

    public void setBalanceInCredits(float BalanceInCredits) {
        this.BalanceInCredits = BalanceInCredits;
    }

    public void setElapsedTimeInMilliseconds(float ElapsedTimeInMilliseconds) {
        this.ElapsedTimeInMilliseconds = ElapsedTimeInMilliseconds;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setOutdatedResult(boolean OutdatedResult) {
        this.OutdatedResult = OutdatedResult;
    }

    public void setHasPdf(boolean HasPdf) {
        this.HasPdf = HasPdf;
    }

    public void setValidationResultRiskIndicator(String ValidationResultRiskIndicator) {
        this.ValidationResultRiskIndicator = ValidationResultRiskIndicator;
    }

    public void setDateString(String DateString) {
        this.DateString = DateString;
    }

    public void setOriginalFilesUrl(String OriginalFilesUrl) {
        this.OriginalFilesUrl = OriginalFilesUrl;
    }

    public void setPdfUrl(String PdfUrl) {
        this.PdfUrl = PdfUrl;
    }

    public void setTotalCost(float TotalCost) {
        this.TotalCost = TotalCost;
    }

    public void setValidationResultRiskIndicatorN(String ValidationResultRiskIndicatorN) {
        this.ValidationResultRiskIndicatorN = ValidationResultRiskIndicatorN;
    }

    public void setResult(Result ResultObject) {
        this.ResultObject = ResultObject;
    }
}

