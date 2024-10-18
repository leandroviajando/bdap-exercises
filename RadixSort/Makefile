BUILDDIR=build
SRCDIR=src

JC=javac -g -d $(BUILDDIR) # The Java compiler, with debug symbols
JV=java -ea -cp $(BUILDDIR) # The Java runtime

default: RadixSort

$(BUILDDIR): # Make the build folder if necessary
	mkdir -p $(BUILDDIR)

# This command generates a .class file for any .java file in the SRCDIR directory
$(BUILDDIR)/%.class: ./$(SRCDIR)/%.java $(BUILDDIR)
	$(JC) $<

.PHONY: RadixSort
RadixSort: $(BUILDDIR)/RadixSort.class
	$(JV) $@

.PHONY: clean
clean:
	rm -r $(BUILDDIR)
