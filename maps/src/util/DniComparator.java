package util;

import domain.Persona;

import java.util.Comparator;

public class DniComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2) {
        int comparatorResult = 0;
        if (persona1.getDni() > persona2.getDni()) {
            comparatorResult = 1;
        } else if (persona1.getDni() < persona2.getDni()) {
            comparatorResult = -1;
        }

        return comparatorResult;
    }
}
