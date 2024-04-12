/**
 * Class for objects of type Messages, where values ​​and methods for the same
 * will be contained.
 * 
 * @version 1.0.0
 */

public class Messages {
    /*
     * Classe responsável pelas mensagens do arquivo .TXT
     * 
     */
    private String date;
    private String messageID;
    private String userID;
    private String replyTo;
    private String media;
    private String text;
    private String automaticTag;
    private String manualAnotation;

    /*
     * Método construtor (permite a manipulação das variáveis)
     * 
     */

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

    /**
     * Método responsável por retornar o valor da variável correspondente: "date"
     * 
     * @return String - Message Date
     */
    public String getDate() {
        return date;
    }

    /**
     * Método responsável por armazenar o valor da variável correspondente: "date"
     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Método responsável por retornar o valor da variável correspondente:
     * "messageID"
     * 
     * @return String - Message Identifier (Message ID)
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Método responsável por armazenar o valor da variável correspondente:
     * "messageID"
     * 
     * @param messageID
     */
    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    /**
     * Método responsável por retornar o valor da variável correspondente: "userID"
     * 
     * @return String - User Identifier (User ID)
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Método responsável por armazenar o valor da variável correspondente: "userID"
     * 
     * @param userID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * Método responsável por retornar o valor da variável correspondente: "replyTo"
     * 
     * @return String - Reply to ID
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

    /**
     * Método responsável por retornar o valor da variável correspondente: "media"
     * 
     * @return String - Media
     */
    public String getMedia() {
        return media;
    }

    /**
     * Método responsável por armazenar o valor da variável correspondente: "media"
     * 
     * @param media
     */
    public void setMedia(String media) {
        this.media = media;
    }

    /**
     * Método responsável por retornar o valor da variável correspondente: "text"
     * 
     * @return String - Message Text
     */
    public String getText() {
        return text;
    }

    /**
     * Método responsável por armazenar o valor da variável correspondente: "media"
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Método responsável por retornar o valor da variável correspondente:
     * "automaticTag"
     * 
     * @return String - Automatic Tag
     */
    public String getAutomaticTag() {
        return automaticTag;
    }

    /**
     * Método responsável por armazenar o valor da variável correspondente:
     * "automaticTag"
     * 
     * @param automaticTag
     */
    public void setAutomaticTag(String automaticTag) {
        this.automaticTag = automaticTag;
    }

    /**
     * Método responsável por retornar o valor da variável correspondente:
     * "manualAnotation"
     * 
     * @return String
     */
    public String getManualAnotation() {
        return manualAnotation;
    }

    /**
     * Método responsável por armazenar o valor da variável correspondente:
     * "manualAnotation"
     * 
     * @param manualAnotation
     */
    public void setManualAnotation(String manualAnotation) {
        this.manualAnotation = manualAnotation;
    }

    /**
     * Método responsável por mostrar as variáveis seguidas de sua descrição
     */
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