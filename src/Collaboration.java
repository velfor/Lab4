public class Collaboration extends Company {
    protected String projectName;

    // Конструктор
    public Collaboration(String name, int employeeCount, String projectName) {
        super(name, employeeCount);
        this.projectName = projectName;
    }

    // Геттеры и сеттеры
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Collaboration that = (Collaboration) o;

        return projectName.equals(that.projectName);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + projectName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Collaboration{" +
                "name='" + name + '\'' +
                ", employeeCount='" + employeeCount +'\''+
                "projectName='" + projectName + '\''+
                '}';
    }
}