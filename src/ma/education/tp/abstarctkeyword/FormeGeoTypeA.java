package ma.education.tp.abstarctkeyword;

public abstract class FormeGeoTypeA extends FormeGeometrique {
    double surface;

    public abstract double calculerSurface();

    public void afficherSurface() {
        System.out.println(this.surface);
    }
}
