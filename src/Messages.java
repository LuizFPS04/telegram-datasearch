public class Messages {

    private String date;
    private String messageID;
    private String userID;
    private String replyTo;
    private String media;
    private String text;
    private String automaticTag;
    private String manualAnotation;

    public Messages(String date, String messageID, String userID, String replyTo, String media, String text,
            String automaticTag, String manualAnotation) {
        this.date = date;
        this.messageID = messageID;
        this.userID = userID;
        this.replyTo = replyTo;
        this.media = media;
        this.text = text;
        this.automaticTag = automaticTag;
        this.manualAnotation = manualAnotation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAutomaticTag() {
        return automaticTag;
    }

    public void setAutomaticTag(String automaticTag) {
        this.automaticTag = automaticTag;
    }

    public String getManualAnotation() {
        return manualAnotation;
    }

    public void setManualAnotation(String manualAnotation) {
        this.manualAnotation = manualAnotation;
    }

    public void showAll() {
        System.out.println("Date: " + date);
        System.out.println("Message ID: " + messageID);
        System.out.println("User ID: " + userID);
        System.out.println("Reply To: " + replyTo);
        System.out.println("Media: " + media);
        System.out.println("Text: " + text);
        System.out.println("Automatic Tag: " + automaticTag);
        System.out.println("Manual Anotation: " + manualAnotation);
    }

}
