/**Class for objects of type Messages, where values ​​and methods for the same will be contained.
* @version 1.0.0
*/

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

    
    /** Method to return the message date
     * @return String - Message Date
     */
    public String getDate() {
        return date;
    }

    
    /** 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    
    /** Method to return the identifier message
     * @return String - Message Identifier (Message ID)
     */
    public String getMessageID() {
        return messageID;
    }

    
    /** 
     * @param messageID
     */
    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    
    /** Method to return the identifier user
     * @return String - User Identifier (User ID)
     */
    public String getUserID() {
        return userID;
    }

    
    /** 
     * @param userID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    
    /** Method to get back to whoever responded
     * @return String - To answer ID
     */
    public String getReplyTo() {
        return replyTo;
    }

    
    /** 
     * @param replyTo
     */
    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    
    /** Method to return media if exists
     * @return String - Media
     */
    public String getMedia() {
        return media;
    }

    
    /** 
     * @param media
     */
    public void setMedia(String media) {
        this.media = media;
    }

    
    /** Method to return text message to be sent
     * @return String - Message Text
     */
    public String getText() {
        return text;
    }

    
    /** 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    
    /** Method to return automatic message tags
     * @return String - Automatic Tag
     */
    public String getAutomaticTag() {
        return automaticTag;
    }

    
    /** 
     * @param automaticTag
     */
    public void setAutomaticTag(String automaticTag) {
        this.automaticTag = automaticTag;
    }

    
    /** 
     * @return String
     */
    public String getManualAnotation() {
        return manualAnotation;
    }

    
    /** 
     * @param manualAnotation
     */
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