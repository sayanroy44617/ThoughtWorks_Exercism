import java.util.*;
class RnaTranscription {
    private Map<Character , Character> transcriptionMap;

    public RnaTranscription()
    {
        transcriptionMap = new HashMap<>();
        transcriptionMap.put('G','C');
        transcriptionMap.put('C','G');
        transcriptionMap.put('T','A');
        transcriptionMap.put('A','U');

    }
    String transcribe(String dnaStrand) {
       char[] rnaArray = new char[dnaStrand.length()];

       for(int i=0 ; i<dnaStrand.length() ;i++)
       {
           rnaArray[i] = transcriptionMap.get(dnaStrand.charAt(i));
       }

       return new String(rnaArray);

    }

}
