public class Response {
    private String content;

    public void sendResponse(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
