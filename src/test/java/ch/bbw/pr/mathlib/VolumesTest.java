// Ali Olayan
package ch.bbw.pr.mathlib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VolumesTest {

    private final Volumes volumes = new Volumes();

    @Test
    void cylinderVolume() {
        double result = volumes.cylinder(2.0, 5.0);
        assertEquals(62.8319, result, 0.0001);
    }

    @Test
    void cylinderRejectsNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> volumes.cylinder(-1, 5));
    }

    @Test
    void cubeVolume() {
        assertEquals(27.0, volumes.cube(3.0), 0.0001);
    }

    @Test
    void sphereVolume() {
        double result = volumes.sphere(3.0);
        assertEquals(113.0973, result, 0.0001);
    }
}
