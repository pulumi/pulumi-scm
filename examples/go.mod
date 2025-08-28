module github.com/pulumi/pulumi-scm/examples

go 1.23.11

toolchain go1.24.6

require github.com/stretchr/testify v1.10.0

require (
	github.com/davecgh/go-spew v1.1.1 // indirect
	github.com/pmezard/go-difflib v1.0.0 // indirect
	gopkg.in/yaml.v3 v3.0.1 // indirect
)

replace github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20250530111747-935112552988
