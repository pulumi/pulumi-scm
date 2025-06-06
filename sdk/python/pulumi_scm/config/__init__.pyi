# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

authFile: Optional[str]
"""
The file path to the JSON file with auth creds for SCM.
"""

authUrl: Optional[str]
"""
The URL to send auth credentials to which will return a JWT. Default:
`https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
file variable: `auth_url`.
"""

clientId: Optional[str]
"""
The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `client_id`.
"""

clientSecret: Optional[str]
"""
The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
`client_secret`.
"""

headers: Optional[str]
"""
Custom HTTP headers to be sent with all API commands. Environment variable: `SCM_HEADERS`. JSON config file variable:
`headers`.
"""

host: Optional[str]
"""
The hostname of Strata Cloud Manager API. Default: `api.sase.paloaltonetworks.com`. Environment variable: `SCM_HOST`.
JSON config file variable: `host`.
"""

logging: Optional[str]
"""
The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
`SCM_LOGGING`. JSON config file variable: `logging`.
"""

port: Optional[int]
"""
The port number to use for API commands, if non-standard for the given protocol. Environment variable: `SCM_PORT`. JSON
config file variable: `port`.
"""

protocol: Optional[str]
"""
The protocol to use for SCM. This should be 'http' or 'https'. Default: `https`. Environment variable: `SCM_PROTOCOL`.
JSON config file variable: `protocol`.
"""

scope: Optional[str]
"""
The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
"""

