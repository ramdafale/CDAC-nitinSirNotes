var arrayList = new java.util.ArrayList();

arrayList.add("Jack");

arrayList.add("Ram");

arrayList.add("Nick");

arrayList.add("Adam");
arrayList.stream().filter(function(el) {return el.startsWith("A")}).sorted().forEach(function(el) {print(el)});