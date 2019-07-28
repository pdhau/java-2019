package collection.section1.lecture57;

public interface ISimpleMobilePhone {
    public boolean store(Contact contact);
    public boolean modify(Contact contact);
    public void remove(Contact contact);
    public boolean query(Contact contact);
}
