package entities;
// Crea una clase de entidad llamada "Rutina" con los siguientes atributos: id, nombre, duracion, nivelDificultad,
////        descripcion
public class Routine {
    private int id;
    private String name;
    private int duration;
    private int difficultyLevel;

    private String description;

    public Routine() {
    }

    public Routine(int id, String name, int duration, int difficultyLevel, String description) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.difficultyLevel = difficultyLevel;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
