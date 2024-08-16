class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        num3=nums1+nums2
        num3.sort()
        if len(num3) % 2==0:
            med1=len(num3)//2
            med2=med1-1
            tot=(num3[med1]+num3[med2])
            media=tot/2.0
            return(media)
        else:
            med=len(num3)//2
            median=num3[med]
            return(median) 