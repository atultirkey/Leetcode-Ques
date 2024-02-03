
class Node:
	def __init__(self, key):
		self.key = key
		self.next = None
		


def newNode(key):
	return Node(key)


a = Node(5)
a.next = Node(10)
a.next.next = Node(15)
a.next.next.next = Node(40)

b = Node(2)
b.next = Node(3)
b.next.next = Node(20)

v = []
while(a is not None):
	v.append(a.key)
	a = a.next

while(b is not None):
	v.append(b.key)
	b = b.next

v.sort()
result = Node(-1)
temp = result
for i in range(len(v)):
	result.next = Node(v[i])
	result = result.next

temp = temp.next
print("Resultant Merge Linked List is : ")
while(temp is not None):
	print(temp.key, end=" ")
	temp = temp.next
