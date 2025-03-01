INSERT INTO AllowedFieldOverrides
VALUES
    ('100','Person', 'personId'),
    ('200','PersonHistory', 'firstName'),
    ('201','PersonHistory', 'middleName'),
    ('202','PersonHistory', 'lastName'),
    ('203','PersonHistory', 'displayName'),
    ('300','Employment','employeeId'),
    ('400','EmploymentHistory','hr') ;

INSERT INTO Locale
VALUES
    ('en_GB','English'),
    ('da_DK', 'Danish'),
    ('de_DE', 'German');
INSERT INTO Country
VALUES
    ('DNK', 'Denmark', 'DK'),
    ('SWE', 'Sweden', 'SE'),
    ('NOR', 'Norway', 'NO');
