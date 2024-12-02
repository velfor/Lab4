public class Cloud extends Collaboration {
    private boolean isPublic;

    public Cloud(String name, int employeeCount, String projectName, boolean isPublic) {
        super(name, employeeCount, projectName);
        this.isPublic = isPublic;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public void togglePublicAccess() {
        this.isPublic = !this.isPublic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cloud cloud = (Cloud) o;

        return isPublic == cloud.isPublic;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isPublic ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cloud{" +
                "isPublic=" + isPublic +
                ", projectName='" + projectName + '\'' +
                ", name='" + name + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }
}



