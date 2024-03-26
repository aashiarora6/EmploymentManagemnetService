package net.aashicodes.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private static long serialVersionUID = 1L;
    private String resourceName;
    private String fieldName;
    private String fieldValue;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public ResourceNotFoundException(String resourceName, String fieldName, long serialVersionUID) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, serialVersionUID));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.serialVersionUID = serialVersionUID;
    }
}
