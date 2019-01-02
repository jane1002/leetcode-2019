// assumption, email name only contains small letters and . +


class 929_UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> res = new HashSet<>();

        for(int i = 0; i < emails.length; i++) {
            char[] curEmail = emails[i].toCharArray();
            StringBuffer sb = new StringBuffer();
            int atIndex = emails[i].indexOf('@');

            for(int j = 0; j < curEmail.length; j++) {

                if(j < atIndex) {
                     if(curEmail[j] == '.') {
                        continue;
                    } else if (curEmail[j] == '+') {
                        j = atIndex;
                    } else {
                        sb.append(String.valueOf(curEmail[j]));
                    }
                } else {
                    sb.append(String.valueOf(curEmail[j]));
                }
            }
            res.add(sb.toString());
        }

        return res.size();
    }
}