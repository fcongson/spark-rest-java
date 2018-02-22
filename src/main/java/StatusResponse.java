import lombok.Getter;

public enum StatusResponse {
    SUCCESS("Success"),
    ERROR("Error");

    @Getter
    private String status;

    StatusResponse(String status) {
        this.status = status;
    }
}
