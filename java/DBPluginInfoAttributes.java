// ***************************************************************************
//
// Copyright (c) 2000 - 2015, Lawrence Livermore National Security, LLC
// Produced at the Lawrence Livermore National Laboratory
// LLNL-CODE-442911
// All rights reserved.
//
// This file is  part of VisIt. For  details, see https://visit.llnl.gov/.  The
// full copyright notice is contained in the file COPYRIGHT located at the root
// of the VisIt distribution or at http://www.llnl.gov/visit/copyright.html.
//
// Redistribution  and  use  in  source  and  binary  forms,  with  or  without
// modification, are permitted provided that the following conditions are met:
//
//  - Redistributions of  source code must  retain the above  copyright notice,
//    this list of conditions and the disclaimer below.
//  - Redistributions in binary form must reproduce the above copyright notice,
//    this  list of  conditions  and  the  disclaimer (as noted below)  in  the
//    documentation and/or other materials provided with the distribution.
//  - Neither the name of  the LLNS/LLNL nor the names of  its contributors may
//    be used to endorse or promote products derived from this software without
//    specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
// ARE  DISCLAIMED. IN  NO EVENT  SHALL LAWRENCE  LIVERMORE NATIONAL  SECURITY,
// LLC, THE  U.S.  DEPARTMENT OF  ENERGY  OR  CONTRIBUTORS BE  LIABLE  FOR  ANY
// DIRECT,  INDIRECT,   INCIDENTAL,   SPECIAL,   EXEMPLARY,  OR   CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
// SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
// CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
// LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
// OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
// DAMAGE.
//
// ***************************************************************************

package llnl.visit;

import java.util.Vector;
import java.lang.Integer;

// ****************************************************************************
// Class: DBPluginInfoAttributes
//
// Purpose:
//    This class contains the attributes for all the database plugins.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class DBPluginInfoAttributes extends AttributeSubject
{
    private static int DBPluginInfoAttributes_numAdditionalAtts = 7;

    public DBPluginInfoAttributes()
    {
        super(DBPluginInfoAttributes_numAdditionalAtts);

        types = new Vector();
        hasWriter = new Vector();
        dbReadOptions = new Vector();
        dbWriteOptions = new Vector();
        typesFullNames = new Vector();
        license = new Vector();
        host = new String("");
    }

    public DBPluginInfoAttributes(int nMoreFields)
    {
        super(DBPluginInfoAttributes_numAdditionalAtts + nMoreFields);

        types = new Vector();
        hasWriter = new Vector();
        dbReadOptions = new Vector();
        dbWriteOptions = new Vector();
        typesFullNames = new Vector();
        license = new Vector();
        host = new String("");
    }

    public DBPluginInfoAttributes(DBPluginInfoAttributes obj)
    {
        super(DBPluginInfoAttributes_numAdditionalAtts);

        int i;

        types = new Vector(obj.types.size());
        for(i = 0; i < obj.types.size(); ++i)
            types.addElement(new String((String)obj.types.elementAt(i)));

        hasWriter = new Vector();
        for(i = 0; i < obj.hasWriter.size(); ++i)
        {
            Integer iv = (Integer)obj.hasWriter.elementAt(i);
            hasWriter.addElement(new Integer(iv.intValue()));
        }
        // *** Copy the dbReadOptions field ***
        dbReadOptions = new Vector(obj.dbReadOptions.size());
        for(i = 0; i < obj.dbReadOptions.size(); ++i)
        {
            DBOptionsAttributes oldObj = (DBOptionsAttributes)obj.dbReadOptions.elementAt(i);
            dbReadOptions.addElement(new DBOptionsAttributes(oldObj));
        }

        // *** Copy the dbWriteOptions field ***
        dbWriteOptions = new Vector(obj.dbWriteOptions.size());
        for(i = 0; i < obj.dbWriteOptions.size(); ++i)
        {
            DBOptionsAttributes oldObj = (DBOptionsAttributes)obj.dbWriteOptions.elementAt(i);
            dbWriteOptions.addElement(new DBOptionsAttributes(oldObj));
        }

        typesFullNames = new Vector(obj.typesFullNames.size());
        for(i = 0; i < obj.typesFullNames.size(); ++i)
            typesFullNames.addElement(new String((String)obj.typesFullNames.elementAt(i)));

        license = new Vector(obj.license.size());
        for(i = 0; i < obj.license.size(); ++i)
            license.addElement(new String((String)obj.license.elementAt(i)));

        host = new String(obj.host);

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return DBPluginInfoAttributes_numAdditionalAtts;
    }

    public boolean equals(DBPluginInfoAttributes obj)
    {
        int i;

        // Compare the elements in the types vector.
        boolean types_equal = (obj.types.size() == types.size());
        for(i = 0; (i < types.size()) && types_equal; ++i)
        {
            // Make references to String from Object.
            String types1 = (String)types.elementAt(i);
            String types2 = (String)obj.types.elementAt(i);
            types_equal = types1.equals(types2);
        }
        // Compare the elements in the hasWriter vector.
        boolean hasWriter_equal = (obj.hasWriter.size() == hasWriter.size());
        for(i = 0; (i < hasWriter.size()) && hasWriter_equal; ++i)
        {
            // Make references to Integer from Object.
            Integer hasWriter1 = (Integer)hasWriter.elementAt(i);
            Integer hasWriter2 = (Integer)obj.hasWriter.elementAt(i);
            hasWriter_equal = hasWriter1.equals(hasWriter2);
        }
        // Compare the elements in the dbReadOptions vector.
        boolean dbReadOptions_equal = (obj.dbReadOptions.size() == dbReadOptions.size());
        for(i = 0; (i < dbReadOptions.size()) && dbReadOptions_equal; ++i)
        {
            // Make references to DBOptionsAttributes from Object.
            DBOptionsAttributes dbReadOptions1 = (DBOptionsAttributes)dbReadOptions.elementAt(i);
            DBOptionsAttributes dbReadOptions2 = (DBOptionsAttributes)obj.dbReadOptions.elementAt(i);
            dbReadOptions_equal = dbReadOptions1.equals(dbReadOptions2);
        }
        // Compare the elements in the dbWriteOptions vector.
        boolean dbWriteOptions_equal = (obj.dbWriteOptions.size() == dbWriteOptions.size());
        for(i = 0; (i < dbWriteOptions.size()) && dbWriteOptions_equal; ++i)
        {
            // Make references to DBOptionsAttributes from Object.
            DBOptionsAttributes dbWriteOptions1 = (DBOptionsAttributes)dbWriteOptions.elementAt(i);
            DBOptionsAttributes dbWriteOptions2 = (DBOptionsAttributes)obj.dbWriteOptions.elementAt(i);
            dbWriteOptions_equal = dbWriteOptions1.equals(dbWriteOptions2);
        }
        // Compare the elements in the typesFullNames vector.
        boolean typesFullNames_equal = (obj.typesFullNames.size() == typesFullNames.size());
        for(i = 0; (i < typesFullNames.size()) && typesFullNames_equal; ++i)
        {
            // Make references to String from Object.
            String typesFullNames1 = (String)typesFullNames.elementAt(i);
            String typesFullNames2 = (String)obj.typesFullNames.elementAt(i);
            typesFullNames_equal = typesFullNames1.equals(typesFullNames2);
        }
        // Compare the elements in the license vector.
        boolean license_equal = (obj.license.size() == license.size());
        for(i = 0; (i < license.size()) && license_equal; ++i)
        {
            // Make references to String from Object.
            String license1 = (String)license.elementAt(i);
            String license2 = (String)obj.license.elementAt(i);
            license_equal = license1.equals(license2);
        }
        // Create the return value
        return (types_equal &&
                hasWriter_equal &&
                dbReadOptions_equal &&
                dbWriteOptions_equal &&
                typesFullNames_equal &&
                license_equal &&
                (host.equals(obj.host)));
    }

    // Property setting methods
    public void SetTypes(Vector types_)
    {
        types = types_;
        Select(0);
    }

    public void SetHasWriter(Vector hasWriter_)
    {
        hasWriter = hasWriter_;
        Select(1);
    }

    public void SetTypesFullNames(Vector typesFullNames_)
    {
        typesFullNames = typesFullNames_;
        Select(4);
    }

    public void SetLicense(Vector license_)
    {
        license = license_;
        Select(5);
    }

    public void SetHost(String host_)
    {
        host = host_;
        Select(6);
    }

    // Property getting methods
    public Vector GetTypes() { return types; }
    public Vector GetHasWriter() { return hasWriter; }
    public Vector GetDbReadOptions() { return dbReadOptions; }
    public Vector GetDbWriteOptions() { return dbWriteOptions; }
    public Vector GetTypesFullNames() { return typesFullNames; }
    public Vector GetLicense() { return license; }
    public String GetHost() { return host; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteStringVector(types);
        if(WriteSelect(1, buf))
            buf.WriteIntVector(hasWriter);
        if(WriteSelect(2, buf))
        {
            buf.WriteInt(dbReadOptions.size());
            for(int i = 0; i < dbReadOptions.size(); ++i)
            {
                DBOptionsAttributes tmp = (DBOptionsAttributes)dbReadOptions.elementAt(i);
                tmp.Write(buf);
            }
        }
        if(WriteSelect(3, buf))
        {
            buf.WriteInt(dbWriteOptions.size());
            for(int i = 0; i < dbWriteOptions.size(); ++i)
            {
                DBOptionsAttributes tmp = (DBOptionsAttributes)dbWriteOptions.elementAt(i);
                tmp.Write(buf);
            }
        }
        if(WriteSelect(4, buf))
            buf.WriteStringVector(typesFullNames);
        if(WriteSelect(5, buf))
            buf.WriteStringVector(license);
        if(WriteSelect(6, buf))
            buf.WriteString(host);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetTypes(buf.ReadStringVector());
            break;
        case 1:
            SetHasWriter(buf.ReadIntVector());
            break;
        case 2:
            {
                int len = buf.ReadInt();
                dbReadOptions.clear();
                for(int j = 0; j < len; ++j)
                {
                    DBOptionsAttributes tmp = new DBOptionsAttributes();
                    tmp.Read(buf);
                    dbReadOptions.addElement(tmp);
                }
            }
            Select(2);
            break;
        case 3:
            {
                int len = buf.ReadInt();
                dbWriteOptions.clear();
                for(int j = 0; j < len; ++j)
                {
                    DBOptionsAttributes tmp = new DBOptionsAttributes();
                    tmp.Read(buf);
                    dbWriteOptions.addElement(tmp);
                }
            }
            Select(3);
            break;
        case 4:
            SetTypesFullNames(buf.ReadStringVector());
            break;
        case 5:
            SetLicense(buf.ReadStringVector());
            break;
        case 6:
            SetHost(buf.ReadString());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + stringVectorToString("types", types, indent) + "\n";
        str = str + intVectorToString("hasWriter", hasWriter, indent) + "\n";
        str = str + indent + "dbReadOptions = {\n";
        for(int i = 0; i < dbReadOptions.size(); ++i)
        {
            AttributeSubject s = (AttributeSubject)dbReadOptions.elementAt(i);
            str = str + s.toString(indent + "    ");
            if(i < dbReadOptions.size()-1)
                str = str + ", ";
            str = str + "\n";
        }
        str = str + "}\n";
        str = str + indent + "dbWriteOptions = {\n";
        for(int i = 0; i < dbWriteOptions.size(); ++i)
        {
            AttributeSubject s = (AttributeSubject)dbWriteOptions.elementAt(i);
            str = str + s.toString(indent + "    ");
            if(i < dbWriteOptions.size()-1)
                str = str + ", ";
            str = str + "\n";
        }
        str = str + "}\n";
        str = str + stringVectorToString("typesFullNames", typesFullNames, indent) + "\n";
        str = str + stringVectorToString("license", license, indent) + "\n";
        str = str + stringToString("host", host, indent) + "\n";
        return str;
    }

    // Attributegroup convenience methods
    public void AddDbReadOptions(DBOptionsAttributes obj)
    {
        dbReadOptions.addElement(new DBOptionsAttributes(obj));
        Select(2);
    }

    public void ClearDbReadOptions()
    {
        dbReadOptions.clear();
        Select(2);
    }

    public void RemoveDbReadOptions(int index)
    {
        if(index >= 0 && index < dbReadOptions.size())
        {
            dbReadOptions.remove(index);
            Select(2);
        }
    }

    public int GetNumDbReadOptions()
    {
        return dbReadOptions.size();
    }

    public DBOptionsAttributes GetDbReadOptions(int i)
    {
        DBOptionsAttributes tmp = (DBOptionsAttributes)dbReadOptions.elementAt(i);
        return tmp;
    }

    public void AddDbWriteOptions(DBOptionsAttributes obj)
    {
        dbWriteOptions.addElement(new DBOptionsAttributes(obj));
        Select(3);
    }

    public void ClearDbWriteOptions()
    {
        dbWriteOptions.clear();
        Select(3);
    }

    public void RemoveDbWriteOptions(int index)
    {
        if(index >= 0 && index < dbWriteOptions.size())
        {
            dbWriteOptions.remove(index);
            Select(3);
        }
    }

    public int GetNumDbWriteOptions()
    {
        return dbWriteOptions.size();
    }

    public DBOptionsAttributes GetDbWriteOptions(int i)
    {
        DBOptionsAttributes tmp = (DBOptionsAttributes)dbWriteOptions.elementAt(i);
        return tmp;
    }


    // Attributes
    private Vector types; // vector of String objects
    private Vector hasWriter; // vector of Integer objects
    private Vector dbReadOptions; // vector of DBOptionsAttributes objects
    private Vector dbWriteOptions; // vector of DBOptionsAttributes objects
    private Vector typesFullNames; // vector of String objects
    private Vector license; // vector of String objects
    private String host;
}
