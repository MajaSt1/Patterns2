package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Booka;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Booka> bookaSet){

        Map<BookSignature,Book> mapFomSet= new HashMap<>();
       // bookaSet.stream().collect(Collectors.toMap(Booka::getSignature,new Book()));
        for(Booka i : bookaSet) mapFomSet
                .put(new BookSignature(i.getSignature()),new Book(i.getAuthor(),i.getTitle(),i.getPublicationYear()));

        return medianPublicationYear(mapFomSet);
    }
}

