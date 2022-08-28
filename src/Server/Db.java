package Server;

import java.util.ArrayList;
import Model.Client;

public abstract class Db implements Repository {

  private ArrayList<Client> users = new ArrayList<>();

  @Override
  public void add(Client user) {
    users.add(user);
  }

  @Override
  public void remove(Client client) {
    users.remove(client);

  }

  @Override
  public Client getByName(String name) {
    for (Client user : users) {
      if (user.getName().equals(name)) {
        return user;
      }
    }
    return null;
  }

  @Override
  public Client getById(int id) {

    return users.get(id);
  }

  @Override
  public int getCount() {

    return users.size();
  }

}
