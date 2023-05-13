package org.example.comsite;

import org.example.comsite.imagetask.*;

public class Main {
    public static void main(String[] args) {
        Task diagnosis = new Diagnosis();
        Task filtration = new Filtration();
        Task segmentation = new Segmentation();
        ImageTaskComposite composite = new ImageTaskComposite();

        composite.add(diagnosis);
        composite.add(filtration);
        composite.add(segmentation);

        composite.process();

        composite.clear();

        composite.add(diagnosis);
        composite.add(new PreProsess());
        composite.process();

        composite.clear();
    }
}
