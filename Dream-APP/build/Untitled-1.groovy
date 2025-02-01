{
    "success": true,
    "data": {
        "assigned_by": null,
        "assigned_to": null,
        "created_at": "2025-01-23T16:40:54.273Z",
        "created_by": "7e5a025e-cfb9-4e25-9716-753742ae825a",
        "duration": null,
        "id": "abb543ee-a269-469c-87c8-9c05e185b74e",
        "modified_at": "2025-01-23T16:41:41.86Z",
        "params": [
            {
                "Attributes": [
                    {
                        "Attribute": "license_issue_authority",
                        "Condition": "",
                        "DataType": "integer",
                        "DisplayNameAr": "دائرة التنمية الاقتصادية بدبي",
                        "DisplayNameEn": "Dubai Department of Economic Development",
                        "Label": "License Issuing Authority",
                        "Lookup": "LicenseIssueAuthority",
                        "Name": "license_issue_authority",
                        "Required": true,
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "LicenseIssueAuthority.Equal",
                        "Value": "Dubai Department of Economic Development"
                    },
                    {
                        "Attribute": "license_type_id",
                        "Condition": "",
                        "DataType": "integer",
                        "DisplayNameAr": "حرفية",
                        "DisplayNameEn": "Crafts",
                        "Label": "License Type",
                        "Lookup": "TradeLicenseType",
                        "Name": "license_type_id",
                        "Required": true,
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "TradeLicenseType.Equal",
                        "Value": "Crafts"
                    },
                    {
                        "Attribute": "license_number",
                        "Condition": "",
                        "DataType": "string",
                        "Label": "License Number",
                        "Lookup": "",
                        "Name": "license_number",
                        "Required": true,
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": "1031661"
                    },
                    {
                        "Attribute": "name_en",
                        "Condition": "",
                        "DataType": "string",
                        "Label": "Name (English)",
                        "Lookup": "",
                        "Name": "name_en",
                        "Required": true,
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": "PRESTIGE CONSTRUCTIONS LLC"
                    },
                    {
                        "Attribute": "name_ar",
                        "Condition": "",
                        "DataType": "string",
                        "Label": "Name (Arabic)",
                        "Lookup": "",
                        "Name": "name_ar",
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": "شركة بريجستيج كنستراكشنات لم"
                    },
                    {
                        "AttachmentLink": "Establishment Card Issued by ICA",
                        "Attribute": "license_issue_date",
                        "Condition": "",
                        "DataType": "date",
                        "Label": "License Issue Date",
                        "Lookup": "",
                        "Name": "license_issue_date",
                        "Required": true,
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": "2009-07-28"
                    },
                    {
                        "Attribute": "license_expiry_date",
                        "Condition": "",
                        "DataType": "date",
                        "Label": "License Expiry Date",
                        "Lookup": "",
                        "Name": "license_expiry_date",
                        "Required": true,
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": "2020-07-26"
                    },
                    {
                        "Attribute": "legal_type_id",
                        "Condition": "",
                        "DataType": "enum",
                        "DisplayNameAr": "شركة عامة",
                        "DisplayNameEn": "Public Company",
                        "Label": "Legal Type",
                        "Lookup": "LegalType",
                        "Name": "legal_type_id",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "LegalType.Equal",
                        "Value": "Public Company"
                    },
                    {
                        "Attribute": "license_status_id",
                        "Condition": "",
                        "DataType": "integer",
                        "DisplayNameAr": "نشط",
                        "DisplayNameEn": "Active",
                        "Label": "License Status",
                        "Lookup": "TradeLicenseStatus",
                        "Name": "license_status_id",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "TradeLicenseStatus.Equal",
                        "Value": "Active"
                    },
                    {
                        "Attribute": "nationality_id",
                        "Condition": "",
                        "DataType": "enum",
                        "DisplayNameAr": "الإمارات",
                        "DisplayNameEn": "EMIRATES",
                        "Label": "Nationality",
                        "Lookup": "Country",
                        "Name": "nationality_id",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "Country.Equal",
                        "Value": "EMIRATES"
                    },
                    {
                        "Attribute": "establishment_type_id",
                        "Condition": "",
                        "DataType": "integer",
                        "DisplayNameAr": "مؤسسة",
                        "DisplayNameEn": "Establishment",
                        "Lookup": "EstablishmentType",
                        "Name": "establishment_type_id",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "EstablishmentType.Equal",
                        "Value": "Establishment"
                    },
                    {
                        "Attribute": "class_id",
                        "Condition": "",
                        "DataType": "integer",
                        "DisplayNameAr": "أ",
                        "DisplayNameEn": "A",
                        "Label": "Establishment Class",
                        "Lookup": "EstablishmentClass",
                        "Name": "class_id",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "EstablishmentClass.Equal",
                        "Value": "A"
                    },
                    {
                        "Attribute": "activities",
                        "Condition": "",
                        "DataType": "enum",
                        "Label": "Activities",
                        "Lookup": "BusinessActivities",
                        "Name": "activities",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": [
                            3822
                        ]
                    },
                    {
                        "Attribute": "is_branch",
                        "Condition": "",
                        "DataType": "boolean",
                        "Label": "Is this Establishment, a branch?",
                        "Lookup": "",
                        "Name": "is_branch",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": null,
                        "mapping": {
                            "false": "NO",
                            "true": "YES"
                        }
                    },
                    {
                        "Attribute": "parent_name",
                        "Condition": "is_branch=1",
                        "DataType": "string",
                        "Lookup": "",
                        "Name": "parent_name",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "alphaNumericOnly",
                        "Value": ""
                    },
                    {
                        "Attribute": "headquarters",
                        "Condition": "is_branch=1",
                        "DataType": "enum",
                        "Lookup": "Country",
                        "Name": "headquarters",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "Country.Contains",
                        "Value": ""
                    },
                    {
                        "Attribute": "commercial_registration_number",
                        "Condition": "is_branch=1",
                        "DataType": "string",
                        "Lookup": "",
                        "Name": "commercial_registration_number",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "alphaNumericOnly",
                        "Value": "52000600002"
                    }
                ],
                "Name": "establishment_details",
                "Type": "Section"
            },
            {
                "Attributes": [
                    {
                        "Attribute": "primary_land_phone",
                        "Condition": "",
                        "DataType": "string",
                        "Label": "Primary Landline Number",
                        "Lookup": "",
                        "Name": "primary_land_phone",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "digitsOnly",
                        "Value": "971-4-2207539"
                    },
                    {
                        "Attribute": "primary_mobile_phone",
                        "Condition": "",
                        "DataType": "string",
                        "Label": "Primary Mobile Number",
                        "Lookup": "",
                        "Name": "primary_mobile_phone",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": "971-50-8032659"
                    },
                    {
                        "Attribute": "primary_email",
                        "Condition": "",
                        "DataType": "string",
                        "Label": "Primary Email Address",
                        "Lookup": "",
                        "Name": "primary_email",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "emailFormat",
                        "Value": "mohmaad@yopmail.com"
                    },
                    {
                        "Attribute": "primary_fax_number",
                        "Condition": "",
                        "DataType": "string",
                        "Label": "Primary Fax Number (Optional)",
                        "Lookup": "",
                        "Name": "primary_fax_number",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "digitsOnly",
                        "Value": "971-4-2207529"
                    },
                    {
                        "Attribute": "po_box_number",
                        "Condition": "",
                        "DataType": "string",
                        "Label": "P.O Box Number (Optional)",
                        "Lookup": "",
                        "Name": "po_box_number",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "digitsOnly",
                        "Value": "91656"
                    }
                ],
                "Name": "establishment_contact",
                "Type": "Section"
            },
            {
                "Attributes": [
                    {
                        "Attribute": "emirate_id",
                        "Condition": "",
                        "DataType": "integer",
                        "DisplayNameAr": "عجمان",
                        "DisplayNameEn": "Ajman",
                        "Label": "Emirate",
                        "Lookup": "Emirate",
                        "Name": "emirate_id",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "Emirate.Contains",
                        "Value": "Ajman"
                    },
                    {
                        "Attribute": "city_id",
                        "Condition": "",
                        "DataType": "integer",
                        "DisplayNameAr": "فلج المعلا",
                        "DisplayNameEn": "Falaj Al Mualla",
                        "Label": "City",
                        "Lookup": "City",
                        "Name": "city_id",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "City.Contains",
                        "Value": "Falaj Al Mualla"
                    },
                    {
                        "Attribute": "area",
                        "Condition": "",
                        "DataType": "",
                        "Label": "Area (Optional)",
                        "Lookup": "",
                        "Name": "area",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": ""
                    },
                    {
                        "Attribute": "street_number",
                        "Condition": "",
                        "DataType": "string",
                        "Label": "Street Number (Optional)",
                        "Lookup": "",
                        "Name": "street_number",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": ""
                    },
                    {
                        "Attribute": "makani_no",
                        "Condition": "",
                        "DataType": "string",
                        "Label": "Makani Number",
                        "Lookup": "",
                        "Name": "makani_no",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": "hnjhnj"
                    },
                    {
                        "Attribute": "building_number",
                        "Condition": "",
                        "DataType": "string",
                        "Label": "Building Number (Optional)",
                        "Lookup": "",
                        "Name": "building_number",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": ""
                    },
                    {
                        "Attribute": "door_number",
                        "Condition": "",
                        "DataType": "string",
                        "Label": "Door Number (Optional)",
                        "Lookup": "",
                        "Name": "door_number",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "alphaNumericOnly",
                        "Value": ""
                    }
                ],
                "Name": "establishment_address",
                "Type": "Section"
            },
            {
                "Attributes": [
                    {
                        "Condition": "",
                        "DataType": "integer",
                        "Lookup": "LeaseIssueAuthority",
                        "Name": "issue_authority",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "IssueAuthority.Equal"
                    },
                    {
                        "Attribute": "lease_issue_date",
                        "Condition": "",
                        "DataType": "date",
                        "Label": "Lease Start Date",
                        "Lookup": "",
                        "Name": "lease_issue_date",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": "2025-01-22"
                    },
                    {
                        "Attribute": "lease_expiry_date",
                        "Condition": "",
                        "DataType": "date",
                        "Label": "Lease End Date",
                        "Lookup": "",
                        "Name": "lease_expiry_date",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": "2025-01-31"
                    },
                    {
                        "Attribute": "amount",
                        "Condition": "",
                        "DataType": "number",
                        "Label": "Amount",
                        "Lookup": "",
                        "Name": "amount",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "isNumber",
                        "Value": "1111"
                    }
                ],
                "Name": "establishment_lease_details",
                "Type": "Section"
            },
            {
                "Attributes": [
                    {
                        "Condition": "",
                        "DataType": "integer",
                        "Lookup": "OwnershipType",
                        "Name": "owner_type",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "OwnershipType.Equal"
                    },
                    {
                        "Attribute": "full_name_ar",
                        "Condition": "",
                        "DataType": "string",
                        "Lookup": "",
                        "Name": "full_name_ar",
                        "Required": true,
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": "ABID MAHMOOD MOHAMED IBRAHIM"
                    },
                    {
                        "AttachmentLink": "Emirates ID",
                        "Attribute": "full_name_en",
                        "Condition": "",
                        "DataType": "string",
                        "Lookup": "",
                        "Name": "full_name_en",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": "MOSTAFIZUL ISLAM CHOUDHURY"
                    },
                    {
                        "Condition": "",
                        "DataType": "enum",
                        "Lookup": "Gender",
                        "Name": "gender_id",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "Gender.Equal"
                    },
                    {
                        "Condition": "",
                        "DataType": "enum",
                        "Lookup": "MaritalStatus",
                        "Name": "marital_status_id",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "MaritalStatus.Equal"
                    },
                    {
                        "Condition": "",
                        "DataType": "enum",
                        "Lookup": "Religion",
                        "Name": "religion_id",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "Religion.Equal"
                    },
                    {
                        "Condition": "",
                        "DataType": "date",
                        "Lookup": "",
                        "Name": "date_of_birth",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": ""
                    },
                    {
                        "Condition": "",
                        "DataType": "enum",
                        "Lookup": "Doctrine",
                        "Name": "doctrine_id",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "Doctrine.Equal"
                    },
                    {
                        "Condition": "",
                        "DataType": "integer",
                        "Lookup": "",
                        "Name": "uid",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "digitsOnly"
                    },
                    {
                        "Condition": "",
                        "DataType": "string",
                        "Lookup": "",
                        "Name": "eid",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": ""
                    },
                    {
                        "AttachmentLink": "",
                        "Condition": "",
                        "DataType": "enum",
                        "Lookup": "PassportType",
                        "Name": "passport_type",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": ""
                    },
                    {
                        "AttachmentLink": "",
                        "Condition": "",
                        "DataType": "string",
                        "Lookup": "",
                        "Name": "passport_number",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "alphaNumericOnly"
                    },
                    {
                        "AttachmentLink": "",
                        "Condition": "",
                        "DataType": "date",
                        "Lookup": "",
                        "Name": "passport_issue_date",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": ""
                    },
                    {
                        "AttachmentLink": "",
                        "Condition": "",
                        "DataType": "date",
                        "Lookup": "",
                        "Name": "passport_expiry_date",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": ""
                    },
                    {
                        "Condition": "",
                        "DataType": "string",
                        "Lookup": "",
                        "Name": "place_issuance_en",
                        "Required": true,
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": ""
                    },
                    {
                        "Condition": "",
                        "DataType": "string",
                        "Lookup": "",
                        "Name": "place_issuance_ar",
                        "Type": "Attribute",
                        "Validation": ""
                    },
                    {
                        "Condition": "",
                        "DataType": "enum",
                        "Lookup": "Country",
                        "Name": "passport_issuance_country",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "Country.Equal"
                    },
                    {
                        "Condition": "",
                        "DataType": "string",
                        "Lookup": "",
                        "Name": "residency_number",
                        "Required": true,
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": ""
                    },
                    {
                        "Condition": "",
                        "DataType": "number",
                        "Lookup": "",
                        "Name": "percentage_of_ownership",
                        "Required": true,
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": ""
                    },
                    {
                        "Attribute": "nationality_id",
                        "Condition": "",
                        "DataType": "enum",
                        "DisplayNameAr": "الإمارات",
                        "DisplayNameEn": "EMIRATES",
                        "Label": "Nationality",
                        "Lookup": "Country",
                        "Name": "nationality_id",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "Country.Equal",
                        "Value": "EMIRATES"
                    },
                    {
                        "Condition": "",
                        "DataType": "enum",
                        "Lookup": "Country",
                        "Name": "birth_country",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "Country.Equal"
                    },
                    {
                        "Condition": "",
                        "DataType": "string",
                        "Lookup": "",
                        "Name": "place_of_birth",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "alphabetOnly"
                    },
                    {
                        "Condition": "",
                        "DataType": "string",
                        "Lookup": "",
                        "Name": "email",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "emailFormat"
                    },
                    {
                        "Attribute": "mobile_phone",
                        "Condition": "",
                        "DataType": "string",
                        "Lookup": "",
                        "Name": "mobile_phone",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "",
                        "Value": "0504915258"
                    },
                    {
                        "Condition": "",
                        "DataType": "string",
                        "Lookup": "",
                        "Name": "fax_number",
                        "Tables": [],
                        "Type": "Attribute",
                        "Validation": "digitsOnly"
                    }
                ],
                "Docs": [
                    {
                        "Attributes": [
                            {
                                "Name": "eid",
                                "Value": "784-1994-4666342-1"
                            },
                            {
                                "Name": "full_name_ar",
                                "Value": "محمد سيف الدين محمد الولي"
                            },
                            {
                                "Name": "full_name_en",
                                "Value": "Saifeldin Mohamed Alwali"
                            },
                            {
                                "Name": "license_expiry_date",
                                "Value": "2026-08-27"
                            },
                            {
                                "Name": "license_issue_date",
                                "Value": "2024-08-28"
                            },
                            {
                                "Name": "nationality_id",
                                "Value": "9"
                            },
                            {
                                "Name": "emirates_id",
                                "Value": "[object File]"
                            }
                        ]
                    }
                ],
                "Name": "establishment_owner_details",
                "Type": "Section"
            }
        ],
        "priority": null,
        "status": "REQUESTINFO",
        "task_type": "REGISTER_ESTABLISHMENT",
        "user_created": "abdullah@yopmail.com",
        "user_id": "49de7cb6-19a9-4c41-a747-1093eb48d44a",
        "user_submitted_for": null
    }
}