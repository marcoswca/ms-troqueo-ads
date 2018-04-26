package com.troqueo.ads.web.rest.errors;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class NotFoundRequestException extends AbstractThrowableProblem {

    public NotFoundRequestException(){
        super(ErrorConstants.DEFAULT_TYPE, "Not found", Status.NOT_FOUND);
    }
}
