TARGETS = ./bin/Main.class ./bin/BloomFilter.class ./bin/MurmurHash.class 

default: $(TARGETS)

$(TARGETS): ./src/Main.java ./src/BloomFilter.java ./src/MurmurHash.java
	rm -rf ./bin
	mkdir -p ./bin
	javac -d ./bin ./src/Main.java ./src/BloomFilter.java ./src/MurmurHash.java

# Run the code in Main.java
run: default
	java -cp ./bin/ Main

# Clean the compiled files
clean:
	$(RM) $(TARGETS)

