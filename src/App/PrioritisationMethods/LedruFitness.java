package App.PrioritisationMethods;

import java.util.*;

public class LedruFitness {
    public static Set<Integer> ledruFitnessFunctionPrioritisation(ArrayList<ArrayList<Double>> similarityMatrix){
        /*
        Compute the distances for each pair of test cases in T
        Remove duplicates from T (These being duplicate test cases, store them elsewhere tho)
        Find an element t ∈ T with the maximum distance dd(t,T ),
            T := T \{t}, P := t
        While T is not empty
            Find an element t ∈ T with the maximum distance dd(t,P),
                T := T \{t}, P := P.t (t is appended to the sequence)
        Append duplicates to P
        return P
         */
        Set<Integer> p = new LinkedHashSet<>();
        Set<Integer> t = new LinkedHashSet<>();

        //adding all the test cases to set t
        for (int i = 0; i < similarityMatrix.size(); i++){
            t.add(i);
        }

        Integer firstEntry = smallestNeighbor(similarityMatrix);
        p.add(firstEntry);
        t.remove(firstEntry);

        while (t.size() > 0){
            Integer tToPop = dd(similarityMatrix,t,p);
            p.add(tToPop);
            t.remove(tToPop);
        }
        return p;
    }

    private static int smallestNeighbor (ArrayList<ArrayList<Double>> similarityMatrix){
        Map<Integer, Double> smallestDistances =  new HashMap<>();
        for(int i = 0; i < similarityMatrix.size(); i++){
            List<Double> testCaseNeighbors = similarityMatrix.get(i);
            //Shallow copy of testCaseNeighbors
            List<Double> sortedNeighbors = new ArrayList<>(testCaseNeighbors);

            /*By this point, order is not affected by removing null, as we only
            want to find the smallest item in the list. */
            sortedNeighbors.removeAll(Collections.singleton(null));
            Collections.sort(sortedNeighbors);
            Double smallestDistance = sortedNeighbors.get(0);
            smallestDistances.put(i, smallestDistance );
        }
        Map.Entry<Integer, Double> max = null;
        for (Map.Entry<Integer, Double> entry : smallestDistances.entrySet()) {
            if (max == null || max.getValue() < entry.getValue()) {
                max = entry;
            }
        }

        assert max != null;
        return max.getKey();
    }

    /**
     * Given a test cases adjacency list and the permutation p, returns the closest distance from the test case to the
     * permutation p
     *
     * @param adjacencyList adjacency list of test case t
     * @param p permutation
     * @return distance as double
     */
    private static Double closestDistance(ArrayList<Double> adjacencyList, Set<Integer> p){
        List<Double> distancesToP = new ArrayList<>();
        for (int pIndex : p) {
            double distanceToP = adjacencyList.get(pIndex);
            distancesToP.add(distanceToP);
        }
        Collections.sort(distancesToP);
        return distancesToP.get(0);
    }

    private static Integer dd(ArrayList<ArrayList<Double>> similarityMatrix, Set<Integer> t, Set<Integer> p ){
        HashMap<Integer,Double> distances = new HashMap<>();
        for (Integer index : t) {
            ArrayList<Double> adjacencyList = similarityMatrix.get(index);
            Double distance = closestDistance(adjacencyList, p);
            distances.put(index,distance);
        }
        //return the index with the largest distance.

        Map.Entry<Integer, Double> max = null;
        for (Map.Entry<Integer, Double> entry : distances.entrySet()) {
            if (max == null || max.getValue() < entry.getValue() ) {
                max = entry;
            }
        }
        assert max != null;
        return max.getKey();
    }
}
