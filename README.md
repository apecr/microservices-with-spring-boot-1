# microservices-with-spring-boot-1

# Formats in response

Include the Header

* `Accept: application/xml` returns a xml:

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<team>
    <location>California</location>
    <masscote>Peanuts</masscote>
    <name>Snoop</name>
    <players>
        <name>Snoopy</name>
        <position>shortstop</position>
    </players>
    <players>
        <name>Charlie Brown</name>
        <position>pitcher</position>
    </players>
</team>
```

* `Accept: application/json` returns a json:

```json
{
    "name": "Snoop",
    "location": "California",
    "masscote": "Peanuts",
    "players": [
        {
            "name": "Snoopy",
            "position": "shortstop"
        },
        {
            "name": "Charlie Brown",
            "position": "pitcher"
        }
    ]
}
``
