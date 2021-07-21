package main.java.com.rudkin.disabledarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class DisabledArrayList<E> extends ArrayList<E> {
    @Deprecated
    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("We are really sorry, but that list has his weaknesses," +
                " You can`t remove elements from this list :(");
    }

    @Deprecated
    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Oops, You can`t replace the elements in this list");
    }

    @Deprecated
    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Just no, have a Good Day");
    }

    @Deprecated
    @Override
    public void clear() {
        throw new UnsupportedOperationException("You want to remove from this list all of its elements, " +
                "but the list does not want it.");
    }

    @Deprecated
    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Maybe it was`t really smart decision to use that list, " +
                "next time make another choice");
    }

    @Deprecated
    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("The list does not in the mood to do it. " +
                "And he never will be, sorry.");
    }
}
