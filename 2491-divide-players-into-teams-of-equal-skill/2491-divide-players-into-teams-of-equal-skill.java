class Solution {
    public long dividePlayers(int[] skill) {
        long ans = 0;
        if(skill.length <= 1) return -1;
        Arrays.sort(skill);
        int i = 0, j = skill.length-1;
        long chemistry = skill[i] + skill[j];
        while(i < j)
        {
            if(skill[i] + skill[j] != chemistry)
            {
                return -1;
            }
            ans += skill[i] * skill[j];
            i++;
            j--;
        }
        return ans;
    }
}