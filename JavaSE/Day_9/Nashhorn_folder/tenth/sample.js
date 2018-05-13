var Collections = Java.type ("java.util.Collections");
 var ArrayList = Java.type ("java.util.ArrayList");
 var names = new ArrayList ();
 names.add ('Ram');
 names.add ('Mohan');
 names.add ('Shyam');
 print ('Before sort: ', names);
 Collections.sort (names);
 print ('After sort: ', names);