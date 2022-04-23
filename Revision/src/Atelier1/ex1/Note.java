package Atelier1.ex1;



public class Note implements Comparable<Note>{


    private String intitule;
    private float note;



    public Note(String intitule, float note) {
        this.intitule = intitule;
        this.note = note;
    }
    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public float getNote() {
        return note;
    }
    public void setNote(float note) {
        this.note = note;
    }

    @Override
    public int compareTo(Note o) {

        return (int) (this.note-o.note);
    }





}
