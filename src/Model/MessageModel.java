package Model;

public abstract class MessageModel {

  protected String text;
  protected int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public MessageModel() {

  }

  public MessageModel(String text) {
    this.text = text;

  }

  public MessageModel(MessageModel text) {

  }

}