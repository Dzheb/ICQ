package Model;

public class Audio extends MessageModel {
  String text;

  public Audio(String string) {
    super(string);
    super.text = "Воспроизводится аудио: - " + super.text;

  }

}