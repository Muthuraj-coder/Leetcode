int romanToInt(char *s) {
    int result = 0;
    int prevValue = 0;

    for (int i = 0; i < strlen(s); i++) {
        int currValue = 0;
        switch (s[i]) {
            case 'I':
                currValue = 1;
                break;
            case 'V':
                currValue = 5;
                break;
            case 'X':
                currValue = 10;
                break;
            case 'L':
                currValue = 50;
                break;
            case 'C':
                currValue = 100;
                break;
            case 'D':
                currValue = 500;
                break;
            case 'M':
                currValue = 1000;
                break;
        }

        if (currValue > prevValue) {
            result += currValue - 2 * prevValue; 
        } else {
            result += currValue;
        }
        
        prevValue = currValue;
    }

    return result;
}