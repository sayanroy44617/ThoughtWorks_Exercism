class ResistorColor {
    int colorCode(String color) {

        String[] colorCode = colors();
        for(int i=0 ; i<colorCode.length ; i++)
        {
            if(colorCode[i].equals(color))
            {
                return i;
            }
        }

        return 0 ;

    }

    String[] colors() {
        String[] colorCode = new String[10];
        colorCode[0]="black";
        colorCode[1]="brown";
        colorCode[2]="red";
        colorCode[3]="orange";
        colorCode[4]="yellow";
        colorCode[5]="green";
        colorCode[6]="blue";
        colorCode[7]="violet";
        colorCode[8]="grey";
        colorCode[9]="white";

        return colorCode;
    }
}
