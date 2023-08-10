package org.example.erorr;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ErorrDetails {
    private String message;
    private String uri;
    @JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-yyyy hh:mm:ss")
    private Date tinmdstamp;

    public ErorrDetails(){
        this.tinmdstamp=new Date();
    }
    public ErorrDetails(String message, String uri) {
        this.message = message;
        this.uri = uri;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Date getTinmdstamp() {
        return tinmdstamp;
    }

    public void setTinmdstamp(Date tinmdstamp) {
        this.tinmdstamp = tinmdstamp;
    }
}
