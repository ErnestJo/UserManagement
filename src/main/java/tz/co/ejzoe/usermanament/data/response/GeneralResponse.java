package tz.co.ejzoe.usermanament.data.response;

/**
 * @author Ernest Joseph Nzalawahe
 * @created 11/07/2024 - 10:52
 * @project user-manament
 */
public class GeneralResponse<T> {
    private Integer statusCode;
    private String statusDescription;
    private T data;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
