package seedu.addressbook.storage;

import java.nio.file.Path;

import seedu.addressbook.data.AddressBook;

public class StorageStub extends Storage{

    public StorageStub() throws InvalidStorageFilePathException {
        super();
        // TODO Auto-generated constructor stub
    }

    public StorageStub(String filePath) throws InvalidStorageFilePathException{
        super(filePath);
    }
    
    @Override
    public boolean isValidPath(Path filePath) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPath() {
        // TODO Auto-generated method stub
        return null;
    }

}
